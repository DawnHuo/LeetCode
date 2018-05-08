/**
We are given an array asteroids of integers representing asteroids in a row.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.


**/

class Solution {
	public int[] asteroidCollision(int[] asteroids) {
		int explodeCount = 0;
		int roundCount;
		boolean flag = true;
		while(flag){
			roundCount = explodeCount;
			for(int i = 0; i < asteroids.length - 1; i++) {
				int add = 1;
				if(asteroids[i] == 0) continue;
				while((asteroids[i + add] == 0) && ((i + add) < asteroids.length)) {
					add++;
					if((i + add) == asteroids.length) break;
				}
				if((i + add) == asteroids.length) break;
				if((asteroids[i] > 0) && (asteroids[i + add] < 0)) {
					if(asteroids[i] > (-1) * asteroids[i + add]) {
						asteroids[i + add] = 0;
						explodeCount++;
					} else if(asteroids[i] < (-1) * asteroids[i + add]) {
						asteroids[i] = 0;
						explodeCount++;
					} else {
						asteroids[i] = 0;
						asteroids[i + add] = 0;
						explodeCount = explodeCount + 2;
					}
				}
				else if((asteroids[i] < 0) && (asteroids[i + add] > 0)) {
					continue;
				}
			}
			if(roundCount == explodeCount) break;
		}
		int[] s = new int[asteroids.length - explodeCount];
		int j = 0;
		for(int i = 0; i < asteroids.length; i++) {
			if(asteroids[i] != 0) {
				s[j] = asteroids[i];
				j++;
				System.out.print(asteroids[i]+" ");
			}
		}
		return s;
    }
}