def call(String playbookPath, String inventoryPath) {
    sh """
        ansible-playbook -i ${inventoryPath} ${playbookPath}
    """
}
