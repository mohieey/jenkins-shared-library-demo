#!/usr/bin/env groovy
def call(String name) {
    echo "====================The best player is ${name}===================="
    echo "The Branch Name is ${env.BRANCH_NAME}"
}