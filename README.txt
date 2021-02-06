Standalone source installation
==============================

See the Forge Documentation online for more detailed instructions:
http://mcforge.readthedocs.io/en/latest/gettingstarted/

Step 1: Open your command-line and clone the repo.

Step 2: You're left with a choice.
In Eclipse:

1. Open Eclipse, Import > Existing Gradle Project > Select Folder 
   or run "gradlew eclipse" to generate the project.
2. On the bottom panel look for gradle tasks and double click genEclipseRuns
3. File -> Import -> Run/Debug -> Then Locate the runs and import
4. Open Run configurations and change version to 1.12
5. Comment out the Bukkit line in the Newtwork source file

If at any point you are missing libraries in your IDE, or you've run into problems you can run "gradlew --refresh-dependencies" to refresh the local cache. "gradlew clean" to reset everything {this does not affect your code} and then start the processs again.
