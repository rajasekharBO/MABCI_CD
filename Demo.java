package com;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to jenkins");

	}

}
echo "# MABCI_CD" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/rajasekharBO/MABCI_CD.git
git push -u origin main