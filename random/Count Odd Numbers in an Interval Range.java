// TC O(1)


if(low%2 == 0)//skips even values
			low += 1;
		if(high%2 == 0)// skip all the even values
			high -= 1;
		return (high - low)/2 + 1;
