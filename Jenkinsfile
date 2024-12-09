@Library('terraform-shared-library') _
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
            }
        }
        stage('Deploying To UAT Environment') {
            when {
                branch 'uat'
            }
            steps {
                echo 'Deploying To UAT Environment..'
                sayHello 'MEGASTAR'
                runTerraformPlan 'uat.tfvars'
                runTerraformApply 'uat.tfvars'
            }
        }
        stage('Deploying To PROD Environment') {
            when {
                branch 'production'
            }
            steps {
                echo 'Deploying To PROD Environment..'
                sayHello 'MEGASTAR'
                runTerraformPlan 'prod.tfvars'
                runTerraformApply 'prod.tfvars'
            }
        }
    }
}