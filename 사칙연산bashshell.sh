bplist00�_WebMainResource�	
_WebResourceTextEncodingName_WebResourceData_WebResourceMIMEType_WebResourceFrameName^WebResourceURLUutf-8O
�<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <meta http-equiv="Content-Style-Type" content="text/css">
  <title></title>
  <meta name="Generator" content="Cocoa HTML Writer">
  <meta name="CocoaVersion" content="2487.7">
  <style type="text/css">
    p.p1 {margin: 0.0px 0.0px 10.7px 0.0px; font: 14.7px Helvetica; -webkit-text-stroke: #000000}
    p.p2 {margin: 0.0px 0.0px 0.0px 0.0px; font: 14.7px Helvetica; -webkit-text-stroke: #000000}
    span.s1 {font-kerning: none}
  </style>
</head>
<body>
<p class="p1"><span class="s1">#!/bin/bash</span></p>
<p class="p1"><span class="s1"> </span></p>
<p class="p1"><span class="s1">read -p "Please put in the numbers: " user_input</span></p>
<p class="p1"><span class="s1"> </span></p>
<p class="p1"><span class="s1">#echo $user_input</span></p>
<p class="p1"><span class="s1"> </span></p>
<p class="p1"><span class="s1">echo "+, -, /, * Please enter one of them."</span></p>
<p class="p1"><span class="s1"> </span></p>
<p class="p1"><span class="s1">read -p "Please put in the operation: " user_operation</span></p>
<p class="p1"><span class="s1"> </span></p>
<p class="p1"><span class="s1">while true; do</span></p>
<p class="p1"><span class="s1">        if [[ $user_operation != '+' ]] &amp;&amp; [[ $user_operation != '-' ]] &amp;&amp; [[ $user_operation != '*' ]] &amp;&amp; [[ $user_operation != '/' ]] ; then</span></p>
<p class="p1"><span class="s1">                echo -e "Repeat plz"\n</span></p>
<p class="p1"><span class="s1">                read -p "Please put in the operation: " user_operation</span></p>
<p class="p1"><span class="s1">        else</span></p>
<p class="p1"><span class="s1">                #echo $user_operation</span></p>
<p class="p1"><span class="s1">                break</span></p>
<p class="p1"><span class="s1">        fi</span></p>
<p class="p1"><span class="s1">done</span></p>
<p class="p1"><span class="s1"> </span></p>
<p class="p1"><span class="s1">read -p "Please put in the second numbers: " user_second_input</span></p>
<p class="p1"><span class="s1"> </span></p>
<p class="p1"><span class="s1">echo "first: ${user_input}"</span></p>
<p class="p1"><span class="s1">echo "second: ${user_operation}"</span></p>
<p class="p1"><span class="s1">echo "thrid: ${user_second_input}"</span></p>
<p class="p1"><span class="s1">echo $(($user_input $user_operation $user_second_input))</span></p>
<p class="p2"><span class="s1">result=$(($user_input $user_operation</span></p>
</body>
</html>
Ytext/htmlP_file:///index.html    ( F X n � � �(23                           H