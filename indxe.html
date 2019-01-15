--SW DEFAULT:
hostname STOP
banner motd #IBA autorizovany pristup!#
enable password ciscoe
service password-encryption
line con 0
password ciscoc
login
logging synchronous
line vty 0 15
password ciscot
login
logging synchronous
transport input all
exit
no ip domain-lookup



--VZDIALENY MANAZMENT:
ip default-gateway 192.168.99.254
int vlan 9
ip address 192.168.9.250 255.255.255.240
no sh
exit



--VLANY:
vlan 101
name LVT1
!
vlan 999
name NULL
!
vlan 101
name ZIMA
!
vlan 66
name LETO
!
vlan 9
name ADMIN
exit
!
do show vlan brief



--VLANY NA ACCESS INTERFACE:
int range fa 0/1-24
switchport mode access
switchport access vlan 999
shutdown
!
int range fa 0/1-2
switchport mode access
switchport access vlan 66
no sh
!
int range fa 0/10-11
switchport mode access
switchport access vlan 101
no sh
!
int range fa 0/19
switchport mode access
switchport access vlan 9
no sh
!
int range fa 0/16-20
switchport mode access
switchport access vlan 104
no sh
!
int range fa 0/21-22
switchport mode access
switchport access vlan 2
no sh
exit
!
do show vlan brief



--VLANY NA TRUNK INTERFACE:
interface fa0/23
switchport mode trunk
switchport trunk native vlan 9
switchport trunk allowed vlan none
switchport trunk allowed vlan 1,101,103
!
interface fa0/24
switchport mode trunk
switchport trunk native vlan 100
switchport trunk allowed vlan none
switchport trunk allowed vlan 2,102,104
exit
!
do show interface trunk



--PORT-SECURITY:
interface range fa0/1-19
switchport mode access
switchport port-security
switchport port-security mac-address sticky
switchport port-security violation shutdown
switchport port-security maximum 3
switchport port-security mac-address 00d0.9718.1C20



--ETHERCHANNEL:
interface range f0/21-23
channel-protocol pagp
channel-group 6 mode desirable

interface range f0/21-23
channel-protocol pagp
channel-group 6 mode desirable



--VTP:
vtp mode server
vtp domain SPSE
vtp password ciscovtp
do sh vtp status

vtp mode client
vtp domain SPSE
vtp password ciscovtp
do sh vtp status



--STP:
do show spanning-tree
spanning-tree vlan 66 priority 8192
spanning-tree portfast default

spanning-tree mode rapid-pvst 

spanning-tree vlan 1 root primary



--RIP:
router rip
version 2
network 192.168.1.0
network 192.168.2.0
network 192.168.3.0



--OSPF:
router ospf 1
network 192.168.1.0 0.0.0.255 area 0
network 192.168.2.0 0.0.0.255 area 0
network 192.168.3.0 0.0.0.255 area 0



--HSRP:
int vlan 9
standby 9 ip 10.0.0.1
standby 9 priority 200
int vlan 66
standby 66 ip 10.0.0.1
standby 66 priority 200
int vlan 101
standby 101 ip 10.0.0.1
standby 101 priority 100



--SUB-INTERFACE:
int fa 0/0.9
encapsulation dot1Q 9
int fa 0/0.66
encapsulation dot1Q 66
int fa 0/0.101
encapsulation dot1Q 101
