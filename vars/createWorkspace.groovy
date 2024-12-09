def call(String environ = 'human') {
  echo "Creating Terraform Workspaces...."
  sh "terraform version"
  sh "terraform workspace create dev || terraform workspace select dev"
  sh "terraform workspace create uat || terraform workspace select uat"
  sh "terraform workspace create || terraform workspace select prod"
  sh "terraform plan --var-file ${environ}"
}
