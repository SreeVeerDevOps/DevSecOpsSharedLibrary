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
            // when {
            //     branch 'development'
            // }
            steps {
                echo 'Deploying To DEV Environment..'
                sayHello 'MEGASTAR'
                createWorkspace 'dev'
                runTerraformPlan 'dev.tfvars'
                runTerraformApply 'dev.tfvars'
                runTerraformDestroy 'dev.tfvars true'
            }
        }
        stage('Deploying To UAT Environment') {
            // when {
            //     branch 'uat'
            // }
            steps {
                echo 'Deploying To UAT Environment..'
                sayHello 'MEGASTAR'
                createWorkspace 'uat'
                runTerraformPlan 'uat.tfvars'
                runTerraformApply 'uat.tfvars'
                runTerraformDestroy 'uat.tfvars' 'true'
            }
        }
        stage('Deploying To PROD Environment') {
            // when {
            //     branch 'production'
            // }
            steps {
                echo 'Deploying To PROD Environment..'
                sayHello 'MEGASTAR'
                createWorkspace 'prod'
                runTerraformPlan 'prod.tfvars'
                runTerraformApply 'prod.tfvars'
                runTerraformDestroy 'prod.tfvars' 'true'
            }
        }
    }
}