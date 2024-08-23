class Solution {
    public String countAndSay(int n) {
        
        String result = "1";
		for(int i = 1; i < n; i++) {
			result = countAndSayHelper(result);
		}
		return result;
    }

    public String countAndSayHelper(String inputStr) {
		
		int n = inputStr.length();
		StringBuilder outputsb = new StringBuilder();
		char prev = inputStr.charAt(0);
		int count = 1;
		for(int i = 1; i <= n-1; i++) {
			if(inputStr.charAt(i) == prev) {
				count++;
			} else {
				outputsb.append(count).append(prev);
				prev = inputStr.charAt(i);
				count = 1;
			}
		}
		
		outputsb.append(count).append(prev);
		
		return outputsb.toString();
	}
}