using System;

namespace Constant
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			Console.Write("Enter your number: ");
			int number = int.Parse(Console.ReadLine());

			const int SUNDAY	 	= 0;
			const int MONDAY	 	= 1;
			const int TUESDAY 		= 2;
			const int WEDNESDAY 	= 3;
			const int THURSDAY 		= 4;
			const int FRIDAY 		= 5;
			const int SATERDAY 		= 6;


			switch (number) {
			case 0:
				Console.WriteLine ("Sun");
				break;
			case 1:
				Console.WriteLine ("Moon");
				break;
			case 2:
				Console.WriteLine ("Mars");
				break;
			case 3:
				Console.WriteLine ("Mercury");
				break;
			case 4:
				Console.WriteLine ("Jupitor");
				break;
			case 5:
				Console.WriteLine ("Venus");
				break;
			case 6:
				Console.WriteLine ("Saturn");
				break;
			defalt:
				Console.WriteLine ("That number is too big");
				break;
			}
		}
	}
}
