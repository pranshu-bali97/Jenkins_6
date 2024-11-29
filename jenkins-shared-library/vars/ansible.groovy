def call() {
    ansiblePlaybook(
        credentialsId: config.credentialsId ?: '67566dc8-069e-4c59-8308-aac784619a7b',
        installation: config.installation ?: 'Ansible',
        inventory: config.inventory ?: '/jenkins-shared-library/resources/ansible/ansible.cfg',
        playbook: config.playbook ?: '/jenkins-shared-library/resources/ansible/playbook.yml',
        vaultTmpPath: config.vaultTmpPath ?: ''
    )
}
