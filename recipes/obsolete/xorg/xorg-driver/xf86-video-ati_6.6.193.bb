require xorg-driver-video.inc
DEPENDS += " xineramaproto xf86miscproto drm xf86driproto"
PE = "1"
PR = "${INC_PR}.0"

SRC_URI[archive.md5sum] = "102b781f543213852401f3422b18ccc7"
SRC_URI[archive.sha256sum] = "9b0899694000cb91d5643e2482376af24bd495cb01b4c9dcdd6ee3545b0aefae"
