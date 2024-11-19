def call() {
    echo 'Scaling Auto Scaling Group to 10 instances...'
    sh '''
        aws autoscaling update-auto-scaling-group \
        --auto-scaling-group-name ${ASG_NAME} \
        --min-size 10 \
        --desired-capacity 10 \
        --max-size 10 \
        --region ${AWS_REGION}
    '''
}
