import React, { useState, useEffect } from 'react';

const TouristList = () => {
  const [items, setItems] = useState([]);
  const [areaCode, setAreaCode] = useState("11"); // 기본값: 서울(11)
  const [loading, setLoading] = useState(false);
  const [errorMsg, setErrorMsg] = useState("");

  // 지역 리스트 (빅데이터 API 전용 코드)
  const areas = [
    { name: "서울", code: "11" },
    { name: "부산", code: "26" },
    { name: "인천", code: "28" },
    { name: "대구", code: "27" },
    { name: "광주", code: "29" },
    { name: "대전", code: "30" },
    { name: "울산", code: "31" },
    { name: "경기", code: "41" },
    { name: "강원", code: "42" }
  ];

const fetchBigData = () => {
    setLoading(true);
    setErrorMsg("");
    
    // ✅ 날짜를 데이터가 확실히 존재하는 20231201로 변경해서 테스트합니다.
    const url = `http://localhost:8080/api/tour/stats?areaCode=${areaCode}&startYmd=20231201&endYmd=20231201`;
    
    fetch(url)
      .then(res => {
        if (!res.ok) throw new Error(`에러 발생! 상태코드: ${res.status}`);
        return res.json();
      })
      .then(data => {
        console.log("서버에서 온 데이터:", data); // 브라우저 콘솔에서 확인용
        setItems(data);
        setLoading(false);
        // 데이터가 빈 배열([])로 올 경우 처리
        if (!data || data.length === 0) {
          setErrorMsg("2023년 12월 1일 데이터가 아직 공공데이터 서버에 없거나 점검 중입니다.");
        }
      })
      .catch(err => {
        console.error(err);
        setErrorMsg("서버 연결 실패 또는 데이터 처리 에러");
        setLoading(false);
      });
  };

  // 컴포넌트가 처음 뜰 때 실행
  useEffect(() => {
    fetchBigData();
  }, []);

  return (
    <div style={{ padding: '20px', maxWidth: '800px', margin: '0 auto' }}>
      <h1>📊 지역별 관광객 방문 통계</h1>
      
      <div style={{ marginBottom: '20px', backgroundColor: '#f0f2f5', padding: '15px', borderRadius: '8px' }}>
        <label style={{ marginRight: '10px', fontWeight: 'bold' }}>지역 선택:</label>
        <select 
          value={areaCode} 
          onChange={(e) => setAreaCode(e.target.value)}
          style={{ padding: '8px', borderRadius: '4px', border: '1px solid #ccc' }}
        >
          {areas.map(a => <option key={a.code} value={a.code}>{a.name}</option>)}
        </select>
        <button 
          onClick={fetchBigData}
          style={{ marginLeft: '10px', padding: '8px 20px', backgroundColor: '#007bff', color: '#fff', border: 'none', borderRadius: '4px', cursor: 'pointer' }}
        >
          조회하기
        </button>
      </div>

      {loading && <p>데이터를 불러오는 중입니다...</p>}
      {errorMsg && <p style={{ color: 'red', fontWeight: 'bold' }}>{errorMsg}</p>}

      {!loading && items.length > 0 && (
        <div style={{ display: 'grid', gap: '10px' }}>
          {items.map((item, idx) => (
            <div key={idx} style={{ border: '1px solid #ddd', padding: '15px', borderRadius: '8px', boxShadow: '0 2px 4px rgba(0,0,0,0.05)' }}>
              <h3 style={{ margin: '0 0 10px 0', color: '#333' }}>📍 {item.areaNm}</h3>
              <p style={{ margin: '5px 0' }}>👤 <b>관광객 구분:</b> {item.touDivNm}</p>
              <p style={{ margin: '5px 0' }}>📉 <b>방문자 수:</b> <span style={{ color: '#dc3545', fontWeight: 'bold' }}>{Number(item.touNum).toLocaleString()}명</span></p>
              <p style={{ margin: '5px 0', fontSize: '12px', color: '#888' }}>📅 기준일자: {item.baseYmd}</p>
            </div>
          ))}
        </div>
      )}
    </div>
  );
};

export default TouristList;