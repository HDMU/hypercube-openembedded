
IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"

BOOTLOGO ?= "openpli-bootlogo"

# task-base

IMAGE_INSTALL = "task-base\
				netkit-base \
				vsftpd \
				util-linux-ng-fdisk \
				util-linux-ng-sfdisk \
				avahi-daemon \
				ffmpeg \
				fakelocale \
				timezones-alternative \
				${BOOTLOGO} \
				bmc-libshowiframe \
				tuxbox-links \
				cifs \
				flac \
				mtd-utils \
				samba \
				early-configure \
				e2fsprogs-mke2fs \
				e2fsprogs-e2fsck \
				nfs-utils-client \
				kernel-params \
				gst-plugin-dvbmediasink \
				"
OPTIONAL_PACKAGES ?= ""
OPTIONAL_PACKAGES += " \
			openvpn \
			gdb strace \
			procps \
			tcpdump \
			ntp \
			openssh \
			ctorrent nzbget \
			transmission \
			sabnzbd \
			wakelan \
			inadyn-mt \
			cups \
			vim joe \
			mc \
			libdca \
			dvd+rw-tools dvdauthor cdrkit \
			"

export IMAGE_BASENAME = "openpli"
IMAGE_LINGUAS = ""

inherit image

