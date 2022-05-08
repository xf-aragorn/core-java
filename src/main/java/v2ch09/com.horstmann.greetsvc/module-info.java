module v2ch09.com.horstmann.greetsvc
{
   exports v2ch09.com.horstmann.greetsvc;

   provides v2ch09.com.horstmann.greetsvc.GreeterService with
      v2ch09.com.horstmann.greetsvc.internal.FrenchGreeter,
      v2ch09.com.horstmann.greetsvc.internal.GermanGreeterFactory;
}
