var agree1 = document.getElementById("ag1");
var result = new XMLHttpRequest();
//open : 이미지, 동영상, 문서파일 등을 가져오는 함수
//open("통신형태(POST,GET)","파일 경로 및 파일명",ture/false);
//ture : 비동기통신, false: 동기통신
result.open("GET","agree1.txt?v=1",true);
result.onreadystatechange = function(){
	//정상적인 통신일 경우
	if(result.readyState==XMLHttpRequest.DONE && result.status==200){
		var texts = result.response;
		agree1.innerHTML = texts;
	}
	//파일명 또는 파일이 없어서 오류가 발생할 경우
	else if(result.status==404){
		alert("해당 파일을 정상적으로 로드하지 못하였습니다.");
	}
}
result.send(); //통신을 시작하는 명령어 == submit

/*
txt 파일 저장시 언어셋을 명확하게 셋팅 후
저장하여 웹에 반영될 수 있도록 함
*/
document.getElementById
var agree2 = document.getElementById("ag2");
var result2 = new XMLHttpRequest();
result2.open("GET","agree2.txt?v=1",true);
result2.onreadystatechange = function(){

	if(result2.readyState==XMLHttpRequest.DONE && result2.status==200){
		var texts = result2.response;
		agree2.innerText = texts;
	}

	else if(result2.status==404){
		alert("해당 파일을 정상적으로 로드하지 못하였습니다.");
	}
}
result2.send();

//이용약관 쳍크 여부 확인 및 페이지 이동
function join(){
	var a = document.getElementById("agck1"); //이용약관
	var b = document.getElementById("agck2"); //개인정보 수집 및 이용
	
	if(a.checked == false || b.checked == false){
		alert("약관에 동의를 하셔야만 회원가입이 진행됩니다.");
	}
	else{
		//location.href란 Javascript 해당 페이지 강제 이동시 사용됨.
		location.href="./new_join.html?all_agree=Y";
	}
}



//
function abc(){
	var ck = document.getElementById("all_agree");
	var f;
    	for(f=1; f<3; f++){
          document.getElementById("agck"+f).checked = ck.checked;
        } 	
}

function bbb(){
	var k;
	var count = 0;
	for(k=1; k<3; k++){
       var box = document.getElementById("agck"+k).checked;
        if(box ==true){      
             count++;
        }

    }
	
	if(count == 2){
        document.getElementById("all_agree").checked=true;
    }
   	else{
        document.getElementById("all_agree").checked=false;
    }
}
