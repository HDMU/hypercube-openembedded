DESCRIPTION = "User space libs for su980"
SECTION = "base"
LICENSE = "proprietary"
MAINTAINER = "Archer Zhao <archer.zhao@sen5.com>"

PV = '20130221'

SRC_URI = "http://images.hdmedia-universe.com/anderes/su980-user-libs-${PV}.tar.gz"
PROVIDES += "libciplus.so"

FILES_${PN} = "${libdir}/*.so"

do_compile() {
}

do_install() {
	install -d ${D}/${libdir}
	for f in *.a  *.so; do
		install -m 0644 ${S}/$f ${D}/${libdir}
	done
}
