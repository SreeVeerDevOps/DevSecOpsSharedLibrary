def call(String tfvars = 'dev.tfvars', String letsdestroy = false) {
  echo "Running Terraform Code...."
  sh "terraform version"
  sh """
  if (letsdestroy=true)
  then
  terraform destroy --var-file ${tfvars} --auto-approve
  fi
  """
}
