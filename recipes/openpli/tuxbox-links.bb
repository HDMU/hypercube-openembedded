PN = "tuxbox-links"
PV = "1.0"
PR = "r13"

do_install () {
	install -d ${D}/var
	install -d ${D}/var/spool
	install -d ${D}/usr/emu
	install -d ${D}/usr/emu/start
	install -d ${D}/usr/keys
	install -d ${D}/usr/local
	install -d ${D}/usr/bin
	install -d ${D}/etc/cron
	install -d ${D}/etc/tuxbox/scce
	ln -s /usr/emu ${D}/var/
	ln -s /usr/keys ${D}/var/
	ln -s /usr/share ${D}/usr/local/
	ln -s /usr/bin ${D}/var/
	ln -s /etc ${D}/var/
	ln -s /etc/cron ${D}/var/spool/
	ln -s /etc/tuxbox/scce ${D}/var/
}

FILES_${PN} = "/"
