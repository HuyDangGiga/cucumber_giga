# Cucumber Test Automation Project

## Prerequisites

- Java Development Kit (JDK) 17
- Maven 3.6.0 or higher
- IntelliJ IDEA 
  - Plugin Cucumber for Java
  - Plugin Gherkin


## Installation

1. **Clone the repository:**

   ```sh
   git clone https://github.com/HuyDangGiga/cucumber_giga.git
   cd cucumber_giga
   git checkout gforces

2. **Install dependencies:**

   `mvn clean install`

3. **Run tests:**

   Open the project in IntelliJ IDEA.
   Navigate to src/test/java/com/cucumber/runners/TestRunnerSaucelab.java.
   Right-click on the TestRunnerSaucelab class and select Run 'TestRunnerSaucelab'.

## Additional Information

**Project Structure**

`src/test/java/com/cucumber/runners/`: Contains the test runner classes.
`src/test/resources/features/`: Contains the feature files .
`../website/saucelab/stepdefinitions/`: Contains the step definition classes.
`src/test/java/com/cucumber/hooks/`: Contains the hook classes.

**Cucumber Options**
* **features**: path to the feature files
* **glue**: path to the step definitions and hooka
* **tags**: tagged screnarios to run
