#define BIG_ENDIAN = 0;
#define LITTLE_ENDIAN = 1;
int testByteOrder(){

	short int word = 0x0001;
	char * bytes = (*char) &word;
	return (bytes[0] ? LITTLE_ENDIAN : BIG_ENDIAN);

}