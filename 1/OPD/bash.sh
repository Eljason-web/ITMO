mkdir lab0
cd lab0
mkdir charmeleon4 garchomp0 mantine8
mkdir garchomp0/jumpluff garchomp0/lopunny garchomp0/hypno garchomp0/teddiursa garchomp0/metapod
mkdir mantine8/clamperl
cd charmeleon4/
echo "weigth=35.9 height=24.0 atk=5 def=2" > whismur
echo "Тип покемона
NORMAL FLYING" > togetic
echo "Возможности Overland=7 Surface=7 Sky=7 Jump=3
Power 3=0 Intelligence=6 Telekinetic=0 Telepathy=0" > beheeyem
echo "weight=96.6
height=39.0 atk=8 def=6" > purugly
echo "Способности Sand-Attack Thundershock
Quick Attack Double Kick Thunder Fang Pin Missile Agility Thunder Wave
Discharge Last Resort Thunder" > jolteon
cd ../garchomp0/
echo "Способности Overcharge
Intimidate Rivalry" > luxio
cd ../mantine8/
echo "Способности Odor Sleuth Tackle Defense Curl Amnesia
Lick Recycle Screech Chip Away Stockpile Swallow Body Slam Flying
Rollout Natural Gift Snatch Last Resort" > munchlax
echo "Развитые способности
Soundproof" > snover
cd ..
echo "weigth=13.2 height=12.0 atk=4
def=7" > magnemite7
echo "Возможности Overland=3 Jump=1 Power=3
Intelligence=4 Magnetic=0 Sinker=0" > nosepass8
echo "Развитые способности
Swift Swim" > tirtouga5
echo "task 1 executed successfully"
chmod 375 charmeleon4
cd charmeleon4
chmod 444 whismur
chmod 404 beheeyem
chmod 404 purugly
chmod 444 jolteon
cd ..
chmod u=rwx,g=rwx,o=rwx garchomp0
cd garchomp0
chmod u=wx-r,g=rx-w,o=rwx jumpluff
chmod ug+r-wx,o-rwx luxio
chmod u=rwx,g=rw-x,o=r-wx lopunny
chmod u=rwx,go-rwx hypno
chmod u=rx-w,g=rwx,o=rw-x teddiursa
chmod u=rx-w,go=x-rw metapod
cd ..
chmod 064 magnemite7
chmod 550 mantine8
cd mantine8
chmod 333 clamperl
chmod 550 munchlax
chmod 062 snover
cd ..
chmod 620 nosepass8
chmod 400 tirtouga5
echo "task 2 executed successfully"
ln -s mantine8/ Copy_39
chmod u+r mantine8/clamperl mantine8/snover
chmod u+w garchomp0/metapod
cp -r mantine8 garchomp0/metapod
chmod u-r mantine8/clamperl mantine8/snover
chmod u-w garchomp0/metapod
cat charmeleon4/whismur charmeleon4/jolteon > nosepass8_78
ln -s nosepass8 garchomp0/luxionosepass
ln tirtouga5 charmeleon4/togetictirtouga
chmod u+w garchomp0/metapod
cp nosepass8 garchomp0/metapod/
chmod u-w garchomp0/metapod
chmod u+w mantine8
cat nosepass8 > mantine8/munchlaxnosepass
chmod u-w mantine8
echo "task 3 executed successfully"
cd ..
find lab0 -type f -name '*8' -exec cat {} + | wc -c > /tmp/enoch_41.txt
ls -lRt lab0/charmeleon4 | sort -k 6 -k 7
chmod u+r lab0/charmeleon4
ls -lRt lab0/charmeleon4 | sort -k 6 -k 7
chmod u-r lab0/charmeleon4
find lab0 -type f -name '*y' -exec cat {} + 2>/dev/null | sort -r
find lab0 -type f -name "*ti*" -exec ls -l {} + 2>&1 | sort -n -k 2 | head -n 4
find lab0 -type f -name '*r' -exec cat {} + | wc -l 2> /tmp/enoch_4_5.txt | sort -r
find lab0 -type f -name '*y' -exec cat {} + | nl | sort -r
echo "task 4 executed successfully"
cd lab0
rm nosepass8
rm -f garchomp0/luxio
rm garchomp0/luxionosepa*
chmod u+r charmeleon4
rm -f charmeleon4/togetictirtou*
chmod u+w mantine8
chmod u+r mantine8/clamperl
rm -rf mantine8
rmdir garchomp0/hypno
echo "task 5 executed successfully"
