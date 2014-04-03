using System;

namespace operater
{
	class MainClass
	{
		public static void Main (string[] args)
		{

			Console.Write ("Enter the first number: ");
			int firstnum = int.Parse(Console.ReadLine ());

			Console.Write ("Enter the second number: ");
			int secondnum= int.Parse(Console.ReadLine ());

			Console.Write ("Enter the opperation(/,%,+,-,*):");
			               string operation = Console.ReadLine ();

			if (operation == "/") {
				Console.WriteLine ("result={0}", firstnum / secondnum);
			} else if (operation == "%") {
				Console.WriteLine ("result={0}", firstnum % secondnum);
			} else if (operation == "+") {
				Console.WriteLine ("result={0}", firstnum + secondnum);
			} else if (operation == "-") {
				Console.WriteLine ("result={0}", firstnum - secondnum);
			} else if (operation == "*") {
				Console.WriteLine ("result={0}", firstnum * secondnum);
			} 
			else {
				Console.WriteLine ("you entered {0},which is not abalable",operation);
			}




		}
	}
}
