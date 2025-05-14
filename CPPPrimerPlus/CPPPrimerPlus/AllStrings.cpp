#include <iostream>
#include <string.h>


class AllStrings
{
public: 
	AllStrings(){	}
	void GO()
	{
		std::cout << "First we have a character " << std::endl;
		std::cout << "char a = 'a';\n\n" << std::endl;

		char a = 'a';

		std::cout << "a sequence of these characters is called a string. easily depicted as a character array" << std::endl; 
		std::cout << "But C++ being C, it needs you to define the size before hand: \"gOtTa aLloCatE sPaC3 bRo\". " << std::endl;
		
		std::cout << "\nchar aa[10];" << std::endl;
		std::cout << "aa[0] = 'H';" << std::endl;
		std::cout << "aa[1] = 'E';" << std::endl;
		std::cout << "aa[2] = 'L';" << std::endl;
		std::cout << "aa[3] = 'L';" << std::endl;
		std::cout << "aa[4] = 'O';" << std::endl;
		std::cout << "aa[5] = '\\0';" << std::endl;

		char aa[10];
		aa[0] = 'H';
		aa[1] = 'E';
		aa[2] = 'L';
		aa[3] = 'L';
		aa[4] = 'O';
		aa[5] = '\0';
		std::cout << aa << std::endl;

		std::cout << "The \\0 is called the termination character and has to be there when defining strings like this for";
		std::cout << "the computer to know where the character array ends, else it prints garbage values." << std::endl;

		std::cout << "Character array is mutable and still has space left for me to assign more characters to it." << std::endl;

		std::cout << "Another way to define these is by writing the whole string after the array." << std::endl;
		std::cout << "This way you dont have to tell CPP the size of the string it will calculate it automatically" << std::endl;
		std::cout << "But this way the string is immutable." << std::endl;

		std::cout << "\nconst char aab[] = \"Hello World\";\n" << std::endl;

		const char aab[] = "Hello World";

		std::cout << aab << std::endl;

		std::cout << "and you dont have to enter the end of line character, CPP does that itself." << std::endl;

		std::cout << aab[11] << std::endl;

		//Doesnt show because \0 doesnt show on the screen but its there since it prints an empty space

		//Add the string Object details.

		std::string str = "Hello String.h"; 
 
		std::cout << "new std::string object: \"" << str << "\"" << std::endl; 

		
	}
};