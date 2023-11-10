## Steps to reproduce

1. Compile with `./gradlew jar`
2. Change target on mirrord config
3. Run command `mirrord exec -f .mirrord/mirrord.json -- java -jar build/libs/fileReader-1.0-SNAPSHOT.jar <some_remote_file_path>`