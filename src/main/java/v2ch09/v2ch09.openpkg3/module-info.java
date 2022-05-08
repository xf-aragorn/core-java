@SuppressWarnings("module")
module v2ch09.openpkg3
{
   requires com.google.gson;
   opens v2ch09.com.horstmann.places to com.google.gson;
}
