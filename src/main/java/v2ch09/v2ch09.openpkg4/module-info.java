@SuppressWarnings("module")
module v2ch09.openpkg4 {
   requires java.xml.bind;
   opens v2ch09.com.horstmann.places to java.xml.bind;
}
