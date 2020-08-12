FROM selenium/standalone-chrome 

MAINTAINER happyqa

RUN sudo apt-get update && sudo apt-get -y install git

RUN sudo git clone https://github.com/HappyQA/qa-java-2020-03-astupin

RUN sudo apt-get install --assume-yes maven
