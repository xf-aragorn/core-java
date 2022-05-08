@SuppressWarnings("module")
module v2ch09.openpkg 
{
   requires v2ch09.com.horstmann.util;
   opens v2ch09.com.horstmann.places to v2ch09.com.horstmann.util;
}
