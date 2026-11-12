abstract class CloudDeployment{
    String appName;
    CloudDeployment(String name){
        this.appName = name;
    }
    void runCodeQualityChecks(){
        System.out.println("Running SonarQube & security scans for " + appName);
    }
    abstract void builderContainer();
    abstract void pushToCloud();
    void notifyTeam(){
        System.out.println("Deployment successful ! Notification sent to Slack");
    }
    public final void deploy(){
      runCodeQualityChecks();
      builderContainer();
      pushToCloud();
      notifyTeam();  
    }


}
class AwsDeployment extends CloudDeployment{
    AwsDeployment(String name){
        super(name);
    }
    void builderContainer(){
        System.out.println("building lightweight Docker image for Aws");
    }
    void pushToCloud(){
        System.out.println(
            "pushing container to Amazon ECR & launching ECS task" 
        );
    }
}

class AzureDeployment extends CloudDeployment{
    AzureDeployment(String name){
        super(name);
    }
    void builderContainer(){
        System.out.println("Building enterprise Podman container for Azure");
    }
    void pushToCloud(){
        System.out.println("pushing to Azure Container Registry (ACR) & deploying to AKS");
    }
}

class CloudDeploymentPipelineDemo{
    public static void main(String args[]){
        CloudDeployment pipeline;
        pipeline = new AwsDeployment("paymentService");
        pipeline = new AzureDeployment("AnalyticsService");
        pipeline.deploy();
    }
}