def call(String workspace = 'dev') {
  echo "Creating Terraform ${workspace} Workspaces...."
  sh "terraform version"
  sh "terraform workspace create ${workspace} || terraform workspace select ${workspace}"
}
