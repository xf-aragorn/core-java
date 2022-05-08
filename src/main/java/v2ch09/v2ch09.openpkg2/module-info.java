@SuppressWarnings("module")
module v2ch09.openpkg2
{
   requires java.json.bind;
   opens v2ch09.com.horstmann.places to org.eclipse.yasson;
}
