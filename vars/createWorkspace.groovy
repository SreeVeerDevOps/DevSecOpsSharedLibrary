def call(String workspace = 'dev') {
  echo "Creating Terraform ${workspace} Workspaces...."
  sh "terraform version"
  sh "terraform init"
  sh "terraform workspace new ${workspace} || terraform workspace select ${workspace}"
}
