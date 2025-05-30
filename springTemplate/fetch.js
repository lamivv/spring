function read() {
  fetch('http://localhost:8081/board/20/replies')
    .then((response) => response.json())
    .then((json) => console.log(json))
}

function register() {
  fetch('http://localhost:8081/board/20/replies', {
      method: 'POST',
      body: JSON.stringify({
        reply: '냥이 발자국',
        replyer: '땅콩'
      }),
      headers: {
        'Content-type': 'application/json; charset=UTF-8',
      },
    })
    .then((response) => response.json())
    .then((json) => console.log(json));
}

function register2() {
  fetch('http://localhost:8081/board/20/replies', {
      method: 'POST',
      body: "reply=점심 넘 배불럿어&replyer=오늘",
      headers: {
        'Content-Type': 'application/x-www-form-urlencoded',
    },
    })
    .then((response) => response.json())
    .then((json) => console.log(json));
}

register2();