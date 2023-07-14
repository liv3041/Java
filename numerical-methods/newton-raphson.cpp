#include<bits/stdc++.h>

#define f(x)  x*x*x - 5*x + 1 //Equation for question1
#define g(x) 3*x*x - 5        //1st derivative of f(x)


#define u(x,y) x*x + x*y + y*y - 7  //Equation1 for question2
#define v(x,y) x*x*x + y*y*y - 9    //Equation2 for question2

#define dux(x,y)  2*x + y
#define duy(x,y)  x + 2*y

#define dvx(x) 3*(x*x)
#define dvy(y) 3*(y*y)

#define derm(x,y) ((2*x + y) * 3*y*y) - (-3*x*x * (-1*x - 2*y))

using namespace std;

void newtonRaphon1(float x0, float e) {
    float x1, f0, f1, g0;
	 int step = 1, N = 10;
	 cout<<endl<<"Question 1"<< endl;
	 cout<<"Equation is: x^3 - 5x + 1"<< endl;
	 cout<<"Error estimation upto: 10^-6"<< endl;
	 cout<<"Initial approxiamtion, x0 = 0.5"<< endl;
	 
	 do
	 {
		  g0 = g(x0);
		  f0 = f(x0);
		  if(g0 == 0.0)
		  {
			   cout<<"Mathematical Error.";
			   exit(0);
		  }


		  x1 = x0 - f0/g0;


		  cout<<"Iteration-"<<step<<":\t x = "<<setw(10)<<x1<<" and f(x) = "<<setw(10)<<f(x1)<< endl;
		  x0 = x1;

		  step = step+1;

		  if(step > N)
		  {
			   cout<<"Not Convergent.";
			   exit(0);
		  }

		  f1 = f(x1);

	 }while(fabs(f1)>e);


	 cout<<"ROOT OF THE EQUATION: "<< x1<< endl;

}

vector<vector<float>> jacobianInv(int x, int y) {
    int n = 2;
    vector<vector<float>>ans(n, vector<float>(n, 0.0));
    ans[0][0] = dvy(y);
    ans[0][1] = -1 * dvx(x);
    ans[1][0] = -1 * duy(x,y);
    ans[1][1] = dux(x,y);

    return ans;
}

void newtonRaphon2(float x0, float y0, float e) {
    float x1,y1,e1,e2;
    int it = 1;
    cout<<endl<<"Question 2"<< endl;
	cout<<"System of Equation are: x^2 + xy + y^2 = 7 and x^3 + y^3 = 9"<< endl;
	cout<<"Error estimation upto: 10^-6"<< endl;
	cout<<"Initial approxiamtion, x0 = 1.5 and y0 = 0.5"<< endl;
    
    do {
        float uxy = u(x0, y0);
        float vxy = v(x0, y0);
        vector<vector<float>>res = jacobianInv(x0, y0);
        float der = derm(x0, y0);
        float r1 = res[0][0]/der;
        float r2 = res[0][1]/der;
        float c1 = res[1][0]/der;
        float c2 = res[1][1]/der;
        x1 = x0 - (r1 * uxy + r2 * vxy);
        y1 = y0 - (c1 * uxy + c2 * vxy);

        cout<<"ITERATION : "<<it<<" \t x"<<it<<" = "<<x1<<" AND y"<<it<<" = "<<y1<<"\n";

        e1 = fabs(x0 - x1);
        e2 = fabs(y0 - y1);

        x0 = x1;
        y0 = y1;

        it++;

    } while(e1 > e && e2 > e);
    cout<<"ROOTS OF THE SYSTEM OF EQUATION: x = "<<x1<<" y = "<<y1<<endl;
}

int main() {
    float e = 0.000001;
    cout<<"Name - Sulochana Lamichaney"<< endl;
    cout<<"Roll No. - IMH/10056/19\t NT LAB - 3"<< endl;
    cout<< endl<<"*********************"<< endl;
	cout<<"Newton Raphson Method"<< endl;
	cout<<"*********************"<< endl;
    newtonRaphon1(0.5, e);
    newtonRaphon2(1.5, 0.5, e);
}
