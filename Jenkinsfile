//@Library('terraform-shared-library-1') _
@Library(['terraform-shared-library-1@main', 'terraform-shared-library-2@main']) _
pipeline {
    agent any
    stages {
        stage('Creating Workspaces') {
            steps {
                echo 'Creating Workspaces Dev UAT & Prod'
                createWorkspace 'dev'
            }
        }
        stage('Deploying To DEV Environment') {
            when {
                branch 'development'
            }
            steps {
                echo 'Deploying To DEV Environment..'
                sayHello 'MEGASTAR'
                createWorkspace 'dev'
                runTerraformPlan 'dev.tfvars'
                runTerraformApply 'dev.tfvars'
                runTerraformDestroy 'tfvars=dev.tfvars, letsdestroy=false'
            }
        }
        stage('Deploying To UAT Environment') {
            when {
                branch 'uat'
            }
            steps {
                echo 'Deploying To UAT Environment..'
                sayHello 'MEGASTAR'
                createWorkspace 'uat'
                runTerraformPlan 'uat.tfvars'
                runTerraformApply 'uat.tfvars'
                runTerraformDestroy 'tfvars=uat.tfvars, letsdestroy=false'
            }
        }
        stage('Deploying To PROD Environment') {
            when {
                branch 'production'
            }
            steps {
                echo 'Deploying To PROD Environment..'
                sayHello 'MEGASTAR'
                createWorkspace 'prod'
                runTerraformPlan 'prod.tfvars'
                runTerraformApply 'prod.tfvars'
                runTerraformDestroy 'tfvars=prod.tfvar, letsdestroy=false'
            }
        }
        stage('Deploying To MAIN Environment') {
            when {
                branch 'main'
            }
            steps {
                echo 'Deploying To PROD Environment..'
                sayHello 'MEGASTAR'
                createWorkspace 'dev'
                runTerraformPlan 'dev.tfvars'
                runTerraformApply 'dev.tfvars'
                runTerraformDestroy 'tfvars=dev.tfvar, letsdestroy=false'
            }
        }
    }
}