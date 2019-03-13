#!/bin/bash

serverName=jenkinsk8s
workDir=/mnt/k8sApp/$serverName
imageRepertory=47.94.159.51/dev
serverVersion=0.0.1



imageName=jenkinsk8s_image

function buildImage(){
    docker image build --tag $imageRepertory/$imageName:$serverVersion $workDir
}

function pushImage(){
    #docker tag $imageName:$serverVersion $imageRepertory/$imageName:$serverVersion
    docker push $imageRepertory/$imageName:$serverVersion
}

function k8sDeploy(){
    kubectl apply -f $workDir/$serverName.yaml
}

buildImage

pushImage

k8sDeploy