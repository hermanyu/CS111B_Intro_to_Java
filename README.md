# Introduction

This repository contains my notes for CS111B: Intro to Java at City College of San Francisco. I created this repository to document my understanding of Java, as well as Object Oriented Programing concepts at large.

# Set Up

These notes are written in Jupyter Notebooks running on an IJava kernel, installed on an Anaconda environment. Jupyter Notebooks are documents which can switch between readable markdown (for note taking) and code cells (for programming). In order to download and run these notebooks, you will need to install the following:

1. Git Bash
2. Anaconda (installed onto your PATH variable)
3. [Java JDK >= 9](https://www.oracle.com/java/technologies/downloads/) 

In order to run Java code inside of Jupyter Notebooks, you will need to download the [IJava distribution](https://github.com/SpencerPark/IJava). Follow the **Requirements** section on the IJava github page to ensure that Java and the JDK are installed correctly.

1. Download the IJava distribution zip file and unzip it to a `<directory>` of your choice (e.g. a desktop folder named `ijava_temp`).
    * There should be an `install.py` file and a `java` folder. Copy or unzip these into `<directory>`.
2. Open Git Bash and create a new conda environment by running the command `conda create --name <name>` where `<name>` is your name for this environment.
3. Activate the conda environment by running `conda activate <name>`.
4. Install Jupyter by running `conda install jupyter`.
5. Navigate Git Bash to `<directory>` (e.g. by running the command `cd ~/desktop/ijava_temp`).
6. Run the command `python install.py --sys-prefix`. This will run the `install.py` script and install the IJava kernel into your active conda environment.
7. Run the command `jupyter lab` to open Jupyter. You should be able to create notebooks that execute Java code now.

