class Solution {
    public List<Integer> findMajority(int[] arr) {
        
        List<Integer> result = new ArrayList<>();
        
        
        if (arr == null || arr.length == 0) {
            return result;
        }
        
        
        int totalVotes = arr.length;
        int threshold = totalVotes / 3;
        
        
        Map<Integer, Integer> voteCount = new HashMap<>();
        for (int num : arr) {
            voteCount.put(num, voteCount.getOrDefault(num, 0) + 1);
        }
        
        
        for (Map.Entry<Integer, Integer> entry : voteCount.entrySet()) {
            if (entry.getValue() > threshold) {
                result.add(entry.getKey());
            }
        }
        
        
        Collections.sort(result);
        
        return result;
    }
}
    
