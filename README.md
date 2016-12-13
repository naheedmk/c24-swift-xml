C24 Swift Open Edition

This is the C24 Swift Open Edition supplied as a maven project.
The SWIFT jar is located in src/main/resources
It contains all of the SWIFT 2016 java libraries.
The only difference between this version and the enterprise edition is the exclusion of the SWIFT validation rules.
 
Building the project:

Maven is used to control the build lifecycle.
To build the project execute the following maven command: mvn clean install 
   
The only required dependency is on the C24-io-api Runtime library.
To see examples of using this to parse and transform SWIFT messages see the sample java class in src/main/java

Running the project:

To run the project execute the following maven command: mvn exec:java

Links

* [C24 IO] (http://c24tech.com)
* [C24 Git Hub Repository] (https://github.com/C24-Technologies)
* [C24 SWIFT MT103 to SWIFT MX pacs.008.001.01 Transform Example] (https://github.com/C24-Technologies/c24-swift-to-mx-transform)