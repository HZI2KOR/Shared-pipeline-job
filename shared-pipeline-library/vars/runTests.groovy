def call() {
    echo 'Running REST API tests...'
    sh '''
        # Run Pytest on one of the EC2 instances (modify based on setup)
        INSTANCE_ID=$(aws autoscaling describe-auto-scaling-groups \
            --auto-scaling-group-name ${ASG_NAME} \
            --query 'AutoScalingGroups[0].Instances[0].InstanceId' \
            --region ${AWS_REGION} --output text)

        INSTANCE_IP=$(aws ec2 describe-instances \
            --instance-id $INSTANCE_ID \
            --query 'Reservations[0].Instances[0].PublicIpAddress' \
            --region ${AWS_REGION} --output text)

        ssh -o StrictHostKeyChecking=no ec2-user@$INSTANCE_IP "
            cd /path/to/tests &&
            python3 -m pytest --junitxml=report.xml
        "
    '''
}

