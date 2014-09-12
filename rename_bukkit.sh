#/bin/bash
grep -rl org.bukkit src/main/java/org/gplbukkit/ | xargs sed -i 's/org\.bukkit/org\.gplbukkit/g'
