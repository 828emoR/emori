changedFile 내의 내용은 계속 추가될 예정입니다.
JH-SRC 내의 파일을 프로젝트 내의 해당하는 파일과 '교체'를 부탁합니다.
교체 시 JH/webapp/Function 폴더는 프로젝트 내의 view 파일과 매칭됩니다. 해당 폴더명을 Function 으로 바꾼 후 파일 교체를 바랍니다.
해당 파일을 적용하기 위해선 maven 설치가 필요하며, JH 폴더 내의 pom.xml파일과 WEB-INF 폴더 내의 tiles.xml, web.xml 파일을 각각 대응되는 원본 파일과 교체를 해주셔야 합니다.
src 파일은 프로젝트 내의 src 파일과 동일한 위치입니다. 즉 폴더 자체를 완전히 교체해야 하므로 작업중인 내용이거나 교체 된 파일의 경우 반드시 백업 후 적용을 부탁드립니다.
만약 WEB-INF/view 안의 layout.jsp에 오류가 났다면 apache tiles가 제대로 설치되지 않았거나, 적용이 되지 않았을 가능성이 높습니다.
적용이 되지 않은 경우 해당프로젝트 우클릭-maven-update Project 이후 프로젝트 클린 작업을 실행해주시면 대부분 해결되는것으로 확인했습니다.