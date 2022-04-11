class Solution {
public:
    vector<vector<int>> shiftGrid(vector<vector<int>>& grid, int k) {
        vector<int> arr;
        for(int i=0;i<grid.size();i++){
            for(int j=0;j<grid[i].size();j++){
                arr.push_back(grid[i][j]);
            }
        }
        
        int idx = arr.size()- (k % arr.size());
        for(int i=0;i<grid.size();i++){
            for(int j=0;j<grid[i].size();j++){
                grid[i][j] = arr[idx % arr.size()];
                idx++;
            }
        }
        return grid;
    }
};