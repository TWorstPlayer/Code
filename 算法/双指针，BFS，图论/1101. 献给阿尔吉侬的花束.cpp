////#include<bits/stdc++.h>
////#include<queue>
////using namespace std;
////
////typedef pair<int,int> PII;
////int T;
////int R,C;
////char map1[201][201];
////int dis[201][201];
////PII start1;
////PII end1;
////queue<PII> q;
////int dx[4]={0,1,-1,0};
////int dy[4]={-1,0,0,1};
////int bfs(){
////
////	q.push(start1);
////	PII u=q.front();
////	while(q.empty()){
////		q.pop();
////		for(int i=0;i<4;i++){
////			
////			int x=u.first+dx[i];
////			int y=u.first+dy[i];
////			if(map1[x][y]=='#')continue;
////			if(map1[x][y]=='.')
////			{
////				dis[x][y]=dis[u.first][u.second]+1;
////				map1[u.first][u.second]='#';
////				q.push({x,y});
////				continue;
////			}
////			if(map1[x][y]=='E')
////			{
////				printf("%d ",dis[u.first][u.second]+1);
////				return dis[u.first][u.second]+1;
////			}
////			
////			
////		}
////		
////		printf("oop!");
////		return -1;
////		
////		
////		
////	}
////	
////}
////
////int main()
////{
////	scanf("%d",&T);
////	while(T--)
////	{
////		scanf("%d %d",&R,&C);
////		memset(map1, '#', sizeof(map1));//初始化地图，各个点都是墙。
////        memset(dis, 0, sizeof(dis));//初始化dis
////        
////		for(int i=0;i<R;i++)scanf("%s",map1[i]);
////		
////		   for (int i = 0; i < R; i ++ )
////            for (int j = 0; j < C; j ++ )
////                if (map1[i][j] == 'S') start1 = {i, j};
////                else if (map1[i][j] == 'E') end1 = {i, j};
////		
////		bfs();
////		
////		
////		
////		
////	}	
////	
////}
//
//




//#include<bits/stdc++.h>
//#include<queue>
//using namespace std;
//
//typedef pair<int,int> PII;
//int T;
//int R,C;
//char map1[201][201];
//int dis[201][201];
//PII start1;
//queue<PII> q;
//int dx[4]={0,1,-1,0};
//int dy[4]={-1,0,0,1};
//void bfs(){
//
//	q.push(start1);
//	
//	while(!q.empty()){
//	    PII u=q.front();
//		q.pop();
//		for(int i=0;i<4;i++){
//			
//			int x=u.first+dx[i];
//			int y=u.first+dy[i];
//			if(map1[x][y]=='#')continue;
//			if(map1[x][y]=='.')
//			{
//				dis[x][y]=dis[u.first][u.second]+1;
//				map1[x][y]='#';
//				q.push({x,y});
//			//continue;
//			}
//			if(map1[x][y]=='E')
//			{
//				printf("%d\n",dis[u.first][u.second]+1);
//			    return;
//			}
//			
//			
//		}
//		
//		printf("oop!\n");
//	    return;
//		
//	}
//	
//}





//
//int main()
//{
//	scanf("%d",&T);
//	while(T--)
//	{
//		scanf("%d %d",&R,&C);
//		memset(map1, '#', sizeof(map1));//初始化地图，各个点都是墙。
//        memset(dis, 0, sizeof(dis));//初始化dis
//        
//		for(int i=0;i<R;i++)scanf("%s",map1[i]);//这个输入有问题，改成下面的 
//		
//		   for (int i = 1; i <=R; i ++ )
//            for (int j = 1; j <= C; j ++ )
//                if (map1[i][j] == 'S') 
//                {
//                    start1 = {i, j};
//                    map1[i][j]='#';
//                    
//                }
//                
//		
//		bfs();
//		
//		
//		
//		
//	}	return 0;
//	
//}
//





#include<bits/stdc++.h>

using namespace std;

typedef pair<int,int> PII;
int T;
int R,C;
char map1[210][210];
int dis[210][210];
//queue<PII> q;

int dx[4] = {-1, 0, 1, 0};
int dy[4] = {0, 1, 0 ,-1};
void bfs(PII start){
    queue<PII> q;//这个设置成全局变量还是局部变量是完全不同的 
	q.push(start);
	
	while(!q.empty()){
	    PII u=q.front();
		q.pop();
		for(int i=0;i<4;i++){
			
			int x=u.first+dx[i];
			int y=u.second+dy[i];
			if(map1[x][y]=='#')continue;
			if(map1[x][y]=='.')
			{
				dis[x][y]=dis[u.first][u.second]+1;
				map1[x][y]='#';
				q.push({x,y});
			//continue;
			}
			if(map1[x][y]=='E')
			{
				printf("%d\n",dis[u.first][u.second]+1);
			    return;
			}
			
			
		}
		
	}
	printf("oop!\n");
	
}

int main()
{
	scanf("%d",&T);
	PII start1;
	while(T--)
	{
		scanf("%d %d",&R,&C);
		memset(map1, '#', sizeof(map1));//初始化地图，各个点都是墙。
        memset(dis, 0, sizeof(dis));//初始化dis
        
	
		   for (int i = 1; i <=R; i ++ )
		   {
            for (int j = 1; j <= C; j ++ )
            {
                cin >> map1[i][j];
                if (map1[i][j] == 'S') 
                {
                    
                    start1 = {i, j};
                    map1[i][j]='#';
                    
                }
                
            }
		   }
                
		
		bfs(start1);
		
		
		
		
	}	return 0;
	
}
