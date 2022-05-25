#!/usr/bin/env groovy
def call(String name) {
    echo "====================The best player is ${name}===================="
    echo "The Branch Name is ${BRANCH_NAME}"
}