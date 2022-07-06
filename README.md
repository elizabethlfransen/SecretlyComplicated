# SecretlyComplicated
A custom mod for NTC3 Contains features such as custom machines, fluids, items, and other things?

## Gradle Tasks

### Data Generation
Whenever information is changed in reference to data provider (e.g. Localization, Models). Data generation needs to be
ran again. This can be done with the gradle task `runData`. The command to run this is
```shell
./gradlew runData
```
If you run this on windows replace `./gradlew` with `./gradlew.bat`

### Building and Deploying
Refer to [forge documentation](https://mcforge.readthedocs.io/en/1.18.x/)