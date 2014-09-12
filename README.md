wolf-in-a-bukkit
================

Wolf in a bukkit is intended to be an X11/MIT interface for the GPL Bukkit, to allow programs as craftbukkit and spigot to continue to exist.

For this purpose we will make wolf in a bukkit a shell interfacing with the bukkit api.
For this purpose the bukkit api has been modified and uploaded to the repository
https://github.com/tschallacka/GPLBUKKIT

The intention is you can take the bukkit repo you like, change the classpath to gplbukkit instead of bukkit.
On a linux distro you can use the shell script rename_bukkit.sh to change the classpath in the org/bukkit directory files
so you can place them in a folder org/gplbukkit to which wolf in a bukkit will look to.

Wolf in a bukkit will provide its own shell to interface with the bukkit api code. Wolf in a bukkit will not be shipped with the gplbukkit api.
GPLBukkit api will have to be downloaded seperately and installed seperately.

This x11/MIT licensed interface can be used with craftbukkit and shipped with craftbukkit, as long as the bukkit api will be downloaded seperately.

Please look on the reddit for discussion and instructions if you wish to contribute.
http://www.reddit.com/r/wolf_in_a_bukkit/

