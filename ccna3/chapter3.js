var answers = ["802.1D","STP","RSTP","forwarding","learning","redundant links between Layer 2 switches","removing single points of failure with multiple Layer 2 switches","spanning-tree vlan 10 priority 0","StackWise","prevents Layer 2 loops","VLAN ID","Trunk2","MST","forwarding","SW3 will become the root bridge.","SW4 will get a port blocked.","PVST+ optimizes performance on the network through load sharing.","The role of the ports in all VLANs.","The root bridge BID.","Link types are determined automatically.","lowest MAC address","New traffic is discarded by the switch because it is unable to be processed.","forwarding","learning","BPDU guard","Broadcast frames are forwarded back to the sending switch.","root bridge","MAC address","extended system ID","bridge priority","edge ports","EtherChannel","aggregate ports by using EtherChannel","source MAC to destination MAC","source IP to destination IP","A trunked port can be part of an EtherChannel bundle.","allows automatic formation of EtherChannel links","It is Cisco proprietary.","802.3ad","PAgP","switch 1 set to desirable; switch 2 set to desirable.","Traffic cannot be sent to two different switches through the same EtherChannel link.","active","auto","grouping multiple physical ports to increase bandwidth between two switches","The EtherChannel was not configured with the same allowed range of VLANs on each interface.","interface port-channel interface-identifier","Shut down each of the affected interfaces.","VLAN memberships of the interfaces that are used for EtherChannel","speed of the interfaces that are used for EtherChannel","duplex settings of the interfaces that are used for EtherChannel","S1-passive and S2-active","The EtherChannel bundle is not working.","One of the ports on S2 was not configured correctly.","Combine physical ports into a high-speed logical link by configuring EtherChannel.","It is made by combining multiple physical links that are seen as one link between two switches.","allows automatic formation of EtherChannel links","allows use of multivendor devices","Non-trunk ports must belong to the same VLAN.","The interfaces must be configured to the same speed.","The duplex settings of the switch ports on both sides of the physical link must match.","SW2(config-if-range)# channel-group 1 mode active","The EtherChannel bundle is not working.","One of the ports on S2 was not configured correctly.","The EtherChannel is not functional.","The channel group should be configured as a trunk on each switch.","The two interfaces on each of the switches belong to different VLANs.","thisqwertyuiop123456789"];var option = document.getElementsByClassName("ai-option");for(i = 0;i<option.length;i++) {for(j = 0;j<answers.length;j++) {if(option[i].innerHTML.replace("<b>","").replace("</b>","")==answers[j]){option[i].style.cursor = "wait";break;}}}