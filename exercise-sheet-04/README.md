# Exercise sheet 04

## Content of this exercise sheet
This repository contains all projects for exercise sheet 04.

In the **presense part** you will use the Hamster-Simulator to programmatically create two friends for `paule` and control them in the territory.

## Run the project
To install Java, set up your IDE and clone the repository into your workspace, please follow the instructions in "exercise sheet 01, Part 0 - Preparation".

### Run the project in Eclipse
- First, make sure again to have the correct Java version set in your project: Go to `Eclipse` > `Preferences` > `Java` > `Compiler` and set the `Compiler compliance level` to `21`.
- Start the Hamster Simulator by hitting the "Play Button" in the top left corner or in the menu under `Run` > `Run`.

### Run the project in IntelliJ
- First, make sure again to have the correct Java version set in your project: Go to `File` > `Project Structure...` In `Project Settings` > `Project` > `SDK` select `Java 21`.
- In the menu, Go to `Run` > `Edit Configurations...`, click on the plus icon and select `Application`.
- Give it a name, e.g., "HamsterSimulator"
- Now, you have to select the Main class, i.e., the starting point for running the application. To do so, under `Build and Run`, click on `Main class` (or the dollar sign to the right) and select the class `FirstHamsterGameApp`.
- Start the Hamster Simulator by hitting the "Play Button" in the top right corner or in the menu under `Run` > `Run 'HamsterSimulator'`.

### Run the project in VS Code
- Use the instructions presented in [youtu.be/BGJC0pQsQAo](https://youtu.be/BGJC0pQsQAo)

### Run the project via command line with Maven
- Make sure to have set the correct Java version. Test with running `java -version`
- Start app using Maven: `mvn clean compile exec:java@PaulesFriendsGameApp`
 
